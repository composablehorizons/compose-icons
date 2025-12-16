package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.CircleLarge: ImageVector
    get() {
        if (_CircleLarge != null) return _CircleLarge!!
        
        _CircleLarge = ImageVector.Builder(
            name = "circle-large",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.58854f, 2.2153f)
                lineTo(9.58854f, 2.21528f)
                curveTo(9.08311f, 2.07252f, 8.55496f, 2f, 8.00098f, 2f)
                curveTo(7.44699f, 2f, 6.91884f, 2.07252f, 6.41341f, 2.21528f)
                lineTo(6.40659f, 2.21721f)
                lineTo(6.40659f, 2.21718f)
                curveTo(5.89259f, 2.35843f, 5.41641f, 2.55904f, 4.97513f, 2.81819f)
                curveTo(4.5335f, 3.08023f, 4.12844f, 3.39515f, 3.75886f, 3.76472f)
                curveTo(3.39532f, 4.12826f, 3.08274f, 4.53252f, 2.82014f, 4.97935f)
                lineTo(2.81818f, 4.98267f)
                lineTo(2.81818f, 4.98267f)
                curveTo(2.55924f, 5.41938f, 2.35622f, 5.89379f, 2.21039f, 6.409f)
                curveTo(2.07155f, 6.91543f, 2.00098f, 7.44479f, 2.00098f, 8f)
                curveTo(2.00098f, 8.5552f, 2.07155f, 9.08455f, 2.21038f, 9.59097f)
                curveTo(2.35622f, 10.1062f, 2.55946f, 10.5836f, 2.81921f, 11.0259f)
                curveTo(3.08148f, 11.4679f, 3.39423f, 11.8729f, 3.75887f, 12.2421f)
                curveTo(4.12806f, 12.6068f, 4.53308f, 12.9195f, 4.97513f, 13.1818f)
                curveTo(5.41737f, 13.4415f, 5.89472f, 13.6447f, 6.40994f, 13.7906f)
                curveTo(6.91638f, 13.9294f, 7.44575f, 14f, 8.00098f, 14f)
                curveTo(8.55619f, 14f, 9.08555f, 13.9294f, 9.59198f, 13.7906f)
                curveTo(10.1072f, 13.6448f, 10.5816f, 13.4417f, 11.0183f, 13.1828f)
                lineTo(11.0216f, 13.1808f)
                lineTo(11.0216f, 13.1808f)
                curveTo(11.4685f, 12.9182f, 11.8727f, 12.6057f, 12.2363f, 12.2421f)
                curveTo(12.6058f, 11.8726f, 12.9207f, 11.4675f, 13.1827f, 11.0259f)
                curveTo(13.4419f, 10.5846f, 13.6425f, 10.1084f, 13.7838f, 9.59439f)
                lineTo(13.7857f, 9.58756f)
                lineTo(13.7857f, 9.58757f)
                curveTo(13.9285f, 9.08213f, 14.001f, 8.55398f, 14.001f, 8f)
                curveTo(14.001f, 7.44602f, 13.9285f, 6.91787f, 13.7857f, 6.41243f)
                lineTo(13.7838f, 6.40562f)
                lineTo(13.7838f, 6.40561f)
                curveTo(13.6425f, 5.8916f, 13.4421f, 5.41838f, 13.1838f, 4.98267f)
                lineTo(13.1818f, 4.97935f)
                lineTo(13.1818f, 4.97935f)
                curveTo(12.9204f, 4.53447f, 12.6069f, 4.13142f, 12.24f, 3.7685f)
                lineTo(12.2324f, 3.76097f)
                lineTo(12.2325f, 3.76093f)
                curveTo(11.8696f, 3.3941f, 11.4665f, 3.08062f, 11.0216f, 2.81916f)
                lineTo(11.0183f, 2.81721f)
                lineTo(11.0183f, 2.8172f)
                curveTo(10.5826f, 2.55885f, 10.1094f, 2.35844f, 9.59537f, 2.21718f)
                lineTo(9.58854f, 2.2153f)
                close()
                moveTo(14.0439f, 11.5342f)
                curveTo(13.7386f, 12.0492f, 13.3717f, 12.5208f, 12.9434f, 12.9492f)
                curveTo(12.5195f, 13.373f, 12.0479f, 13.7376f, 11.5283f, 14.043f)
                curveTo(11.0133f, 14.3483f, 10.4574f, 14.5853f, 9.86035f, 14.7539f)
                curveTo(9.26335f, 14.918f, 8.64355f, 15f, 8.00098f, 15f)
                curveTo(7.3584f, 15f, 6.73861f, 14.918f, 6.1416f, 14.7539f)
                curveTo(5.5446f, 14.5853f, 4.98633f, 14.3483f, 4.4668f, 14.043f)
                curveTo(3.95182f, 13.7376f, 3.48014f, 13.373f, 3.05176f, 12.9492f)
                curveTo(2.62793f, 12.5208f, 2.26335f, 12.0492f, 1.95801f, 11.5342f)
                curveTo(1.65267f, 11.0146f, 1.41569f, 10.4564f, 1.24707f, 9.85938f)
                curveTo(1.08301f, 9.26237f, 1.00098f, 8.64258f, 1.00098f, 8f)
                curveTo(1.00098f, 7.35742f, 1.08301f, 6.73763f, 1.24707f, 6.14062f)
                curveTo(1.41569f, 5.54362f, 1.65267f, 4.98763f, 1.95801f, 4.47266f)
                curveTo(2.26335f, 3.95312f, 2.62793f, 3.48145f, 3.05176f, 3.05762f)
                curveTo(3.48014f, 2.62923f, 3.95182f, 2.26237f, 4.4668f, 1.95703f)
                curveTo(4.98633f, 1.65169f, 5.5446f, 1.41699f, 6.1416f, 1.25293f)
                curveTo(6.73861f, 1.08431f, 7.3584f, 1f, 8.00098f, 1f)
                curveTo(8.64355f, 1f, 9.26335f, 1.08431f, 9.86035f, 1.25293f)
                curveTo(10.4574f, 1.41699f, 11.0133f, 1.65169f, 11.5283f, 1.95703f)
                curveTo(12.0479f, 2.26237f, 12.5195f, 2.62923f, 12.9434f, 3.05762f)
                curveTo(13.3717f, 3.48145f, 13.7386f, 3.95312f, 14.0439f, 4.47266f)
                curveTo(14.3493f, 4.98763f, 14.584f, 5.54362f, 14.748f, 6.14062f)
                curveTo(14.9167f, 6.73763f, 15.001f, 7.35742f, 15.001f, 8f)
                curveTo(15.001f, 8.64258f, 14.9167f, 9.26237f, 14.748f, 9.85938f)
                curveTo(14.584f, 10.4564f, 14.3493f, 11.0146f, 14.0439f, 11.5342f)
                close()
            }
        }.build()
        
        return _CircleLarge!!
    }

private var _CircleLarge: ImageVector? = null

