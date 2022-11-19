package com.strangerdetection;

import com.github.sarxos.webcam.WebcamDiscoveryEvent;

public interface WebcamDiscoveryListener {
    void webcamFound(WebcamDiscoveryEvent event);

    void webcamGone(WebcamDiscoveryEvent event);
}
