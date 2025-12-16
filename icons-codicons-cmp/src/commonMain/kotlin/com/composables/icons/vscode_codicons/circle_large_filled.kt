package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.CircleLargeFilled: ImageVector
    get() {
        if (_CircleLargeFilled != null) return _CircleLargeFilled!!
        
        _CircleLargeFilled = ImageVector.Builder(
            name = "circle-large-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                curveTo(8.64258f, 1f, 9.26237f, 1.08431f, 9.85938f, 1.25293f)
                curveTo(10.4564f, 1.41699f, 11.0124f, 1.65169f, 11.5273f, 1.95703f)
                curveTo(12.0469f, 2.26237f, 12.5186f, 2.62923f, 12.9424f, 3.05762f)
                curveTo(13.3708f, 3.48145f, 13.7376f, 3.95312f, 14.043f, 4.47266f)
                curveTo(14.3483f, 4.98763f, 14.583f, 5.54362f, 14.7471f, 6.14062f)
                curveTo(14.9157f, 6.73763f, 15f, 7.35742f, 15f, 8f)
                curveTo(15f, 8.64258f, 14.9157f, 9.26237f, 14.7471f, 9.85938f)
                curveTo(14.583f, 10.4564f, 14.3483f, 11.0146f, 14.043f, 11.5342f)
                curveTo(13.7376f, 12.0492f, 13.3708f, 12.5208f, 12.9424f, 12.9492f)
                curveTo(12.5186f, 13.373f, 12.0469f, 13.7376f, 11.5273f, 14.043f)
                curveTo(11.0124f, 14.3483f, 10.4564f, 14.5853f, 9.85938f, 14.7539f)
                curveTo(9.26237f, 14.918f, 8.64258f, 15f, 8f, 15f)
                curveTo(7.35742f, 15f, 6.73763f, 14.918f, 6.14062f, 14.7539f)
                curveTo(5.54362f, 14.5853f, 4.98535f, 14.3483f, 4.46582f, 14.043f)
                curveTo(3.95085f, 13.7376f, 3.47917f, 13.373f, 3.05078f, 12.9492f)
                curveTo(2.62695f, 12.5208f, 2.26237f, 12.0492f, 1.95703f, 11.5342f)
                curveTo(1.65169f, 11.0146f, 1.41471f, 10.4564f, 1.24609f, 9.85938f)
                curveTo(1.08203f, 9.26237f, 1f, 8.64258f, 1f, 8f)
                curveTo(1f, 7.35742f, 1.08203f, 6.73763f, 1.24609f, 6.14062f)
                curveTo(1.41471f, 5.54362f, 1.65169f, 4.98763f, 1.95703f, 4.47266f)
                curveTo(2.26237f, 3.95312f, 2.62695f, 3.48145f, 3.05078f, 3.05762f)
                curveTo(3.47917f, 2.62923f, 3.95085f, 2.26237f, 4.46582f, 1.95703f)
                curveTo(4.98535f, 1.65169f, 5.54362f, 1.41699f, 6.14062f, 1.25293f)
                curveTo(6.73763f, 1.08431f, 7.35742f, 1f, 8f, 1f)
                close()
            }
        }.build()
        
        return _CircleLargeFilled!!
    }

private var _CircleLargeFilled: ImageVector? = null

