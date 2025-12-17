package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.CopilotWarning: ImageVector
    get() {
        if (_CopilotWarning != null) return _CopilotWarning!!
        
        _CopilotWarning = ImageVector.Builder(
            name = "copilot-warning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 7f)
                curveTo(9.015f, 7f, 7f, 9.015f, 7f, 11.5f)
                curveTo(7f, 13.985f, 9.015f, 16f, 11.5f, 16f)
                curveTo(13.985f, 16f, 16f, 13.985f, 16f, 11.5f)
                curveTo(16f, 9.015f, 13.985f, 7f, 11.5f, 7f)
                close()
                moveTo(11f, 9f)
                curveTo(11f, 8.724f, 11.224f, 8.5f, 11.5f, 8.5f)
                curveTo(11.776f, 8.5f, 12f, 8.724f, 12f, 9f)
                verticalLineTo(11.5f)
                curveTo(12f, 11.776f, 11.776f, 12f, 11.5f, 12f)
                curveTo(11.224f, 12f, 11f, 11.776f, 11f, 11.5f)
                verticalLineTo(9f)
                close()
                moveTo(11.5f, 14.25f)
                curveTo(11.086f, 14.25f, 10.75f, 13.914f, 10.75f, 13.5f)
                curveTo(10.75f, 13.086f, 11.086f, 12.75f, 11.5f, 12.75f)
                curveTo(11.914f, 12.75f, 12.25f, 13.086f, 12.25f, 13.5f)
                curveTo(12.25f, 13.914f, 11.914f, 14.25f, 11.5f, 14.25f)
                close()
                moveTo(2.996f, 12.118f)
                verticalLineTo(7.862f)
                lineTo(3.019f, 7.746f)
                curveTo(3.51f, 7.956f, 4.094f, 8.037f, 4.746f, 8.037f)
                curveTo(5.893f, 8.037f, 6.806f, 7.71f, 7.456f, 7.046f)
                curveTo(7.672f, 6.826f, 7.855f, 6.575f, 8f, 6.303f)
                curveTo(8.042f, 6.382f, 8.105f, 6.447f, 8.154f, 6.522f)
                curveTo(8.567f, 6.243f, 9.02f, 6.021f, 9.497f, 5.851f)
                curveTo(9.247f, 5.529f, 9.073f, 5.074f, 8.994f, 4.444f)
                curveTo(8.877f, 3.509f, 9.032f, 3.049f, 9.236f, 2.83f)
                curveTo(9.429f, 2.624f, 9.873f, 2.417f, 10.917f, 2.533f)
                curveTo(11.937f, 2.646f, 12.397f, 2.937f, 12.63f, 3.233f)
                curveTo(12.877f, 3.545f, 13f, 4.022f, 13f, 4.787f)
                curveTo(13f, 5.173f, 12.969f, 5.46f, 12.917f, 5.676f)
                curveTo(13.406f, 5.795f, 13.873f, 5.97f, 14.307f, 6.201f)
                curveTo(14.442f, 5.753f, 14.5f, 5.273f, 14.5f, 4.787f)
                curveTo(14.5f, 3.917f, 14.373f, 3.018f, 13.807f, 2.303f)
                curveTo(13.228f, 1.57f, 12.313f, 1.179f, 11.083f, 1.042f)
                curveTo(9.877f, 0.907997f, 8.821f, 1.076f, 8.139f, 1.807f)
                curveTo(8.09f, 1.86f, 8.04f, 1.915f, 7.996f, 1.972f)
                curveTo(7.953f, 1.915f, 7.907f, 1.86f, 7.857f, 1.807f)
                curveTo(7.175f, 1.076f, 6.119f, 0.907997f, 4.913f, 1.042f)
                curveTo(3.683f, 1.179f, 2.768f, 1.57f, 2.189f, 2.303f)
                curveTo(1.624f, 3.018f, 1.496f, 3.917f, 1.496f, 4.787f)
                curveTo(1.496f, 5.359f, 1.549f, 5.935f, 1.75f, 6.443f)
                curveTo(1.684f, 6.671f, 1.653f, 6.872f, 1.624f, 7.055f)
                curveTo(1.612f, 7.13f, 1.601f, 7.203f, 1.588f, 7.273f)
                curveTo(0.677f, 7.652f, 0.085f, 8.71f, 0f, 9.338f)
                verticalLineTo(11.286f)
                curveTo(0.112f, 12.032f, 2.77f, 14.432f, 6.588f, 14.936f)
                curveTo(6.229f, 14.424f, 5.946f, 13.855f, 5.76f, 13.244f)
                curveTo(4.381f, 12.891f, 3.274f, 12.332f, 2.996f, 12.118f)
                close()
                moveTo(3.367f, 3.233f)
                curveTo(3.601f, 2.937f, 4.061f, 2.646f, 5.08f, 2.533f)
                curveTo(6.125f, 2.417f, 6.569f, 2.624f, 6.762f, 2.83f)
                curveTo(6.966f, 3.049f, 7.12f, 3.509f, 7.003f, 4.444f)
                curveTo(6.913f, 5.17f, 6.701f, 5.675f, 6.386f, 5.997f)
                curveTo(6.087f, 6.302f, 5.601f, 6.537f, 4.748f, 6.537f)
                curveTo(3.825f, 6.537f, 3.468f, 6.339f, 3.306f, 6.158f)
                curveTo(3.127f, 5.958f, 2.998f, 5.58f, 2.998f, 4.787f)
                curveTo(2.998f, 4.022f, 3.12f, 3.545f, 3.367f, 3.233f)
                close()
            }
        }.build()
        
        return _CopilotWarning!!
    }

private var _CopilotWarning: ImageVector? = null

