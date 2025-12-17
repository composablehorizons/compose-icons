package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.GlobeAsiaAustralia: ImageVector
    get() {
        if (_GlobeAsiaAustralia != null) return _GlobeAsiaAustralia!!
        
        _GlobeAsiaAustralia = ImageVector.Builder(
            name = "globe-asia-australia",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.75f, 8.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                curveToRelative(0f, 1.12f, -0.492f, 2.126f, -1.27f, 2.812f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.992f, -1.124f)
                arcTo(2.243f, 2.243f, 0f, false, false, 15f, 9f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2.25f)
                curveToRelative(-5.385f, 0f, -9.75f, 4.365f, -9.75f, 9.75f)
                reflectiveCurveToRelative(4.365f, 9.75f, 9.75f, 9.75f)
                reflectiveCurveToRelative(9.75f, -4.365f, 9.75f, -9.75f)
                reflectiveCurveTo(17.385f, 2.25f, 12f, 2.25f)
                close()
                moveTo(4.575f, 15.6f)
                arcToRelative(8.25f, 8.25f, 0f, false, false, 9.348f, 4.425f)
                arcToRelative(1.966f, 1.966f, 0f, false, false, -1.84f, -1.275f)
                arcToRelative(0.983f, 0.983f, 0f, false, true, -0.97f, -0.822f)
                lineToRelative(-0.073f, -0.437f)
                curveToRelative(-0.094f, -0.565f, 0.25f, -1.11f, 0.8f, -1.267f)
                lineToRelative(0.99f, -0.282f)
                curveToRelative(0.427f, -0.123f, 0.783f, -0.418f, 0.982f, -0.816f)
                lineToRelative(0.036f, -0.073f)
                arcToRelative(1.453f, 1.453f, 0f, false, true, 2.328f, -0.377f)
                lineTo(16.5f, 15f)
                horizontalLineToRelative(0.628f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 1.983f, 1.186f)
                arcToRelative(8.25f, 8.25f, 0f, false, false, -6.345f, -12.4f)
                curveToRelative(0.044f, 0.262f, 0.18f, 0.503f, 0.389f, 0.676f)
                lineToRelative(1.068f, 0.89f)
                curveToRelative(0.442f, 0.369f, 0.535f, 1.01f, 0.216f, 1.49f)
                lineToRelative(-0.51f, 0.766f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -1.161f, 0.886f)
                lineToRelative(-0.143f, 0.048f)
                arcToRelative(1.107f, 1.107f, 0f, false, false, -0.57f, 1.664f)
                curveToRelative(0.369f, 0.555f, 0.169f, 1.307f, -0.427f, 1.605f)
                lineTo(9f, 13.125f)
                lineToRelative(0.423f, 1.059f)
                arcToRelative(0.956f, 0.956f, 0f, false, true, -1.652f, 0.928f)
                lineToRelative(-0.679f, -0.906f)
                arcToRelative(1.125f, 1.125f, 0f, false, false, -1.906f, 0.172f)
                lineTo(4.575f, 15.6f)
                close()
            }
        }.build()
        
        return _GlobeAsiaAustralia!!
    }

private var _GlobeAsiaAustralia: ImageVector? = null

