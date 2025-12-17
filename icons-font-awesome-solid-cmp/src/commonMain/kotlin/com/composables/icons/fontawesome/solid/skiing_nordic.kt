package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.SkiingNordic: ImageVector
    get() {
        if (_SkiingNordic != null) return _SkiingNordic!!
        
        _SkiingNordic = ImageVector.Builder(
            name = "skiing-nordic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(336f, 96f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                reflectiveCurveTo(362.5f, 0f, 336f, 0f)
                reflectiveCurveToRelative(-48f, 21.5f, -48f, 48f)
                reflectiveCurveToRelative(21.5f, 48f, 48f, 48f)
                close()
                moveToRelative(216f, 320f)
                curveToRelative(-13.2f, 0f, -24f, 10.7f, -24f, 24f)
                curveToRelative(0f, 13.2f, -10.8f, 24f, -24f, 24f)
                horizontalLineToRelative(-69.5f)
                lineTo(460f, 285.6f)
                curveToRelative(11.7f, -4.7f, 20.1f, -16.2f, 20.1f, -29.6f)
                curveToRelative(0f, -17.7f, -14.3f, -32f, -32f, -32f)
                horizontalLineToRelative(-44f)
                lineTo(378f, 170.8f)
                curveToRelative(-12.5f, -25.5f, -35.5f, -44.2f, -61.8f, -50.9f)
                lineTo(245f, 98.7f)
                curveToRelative(-28.3f, -6.8f, -57.8f, -0.5f, -80.8f, 17.1f)
                lineToRelative(-39.7f, 30.4f)
                curveToRelative(-14f, 10.7f, -16.7f, 30.8f, -5.9f, 44.9f)
                curveToRelative(0.7f, 0.9f, 1.7f, 1.3f, 2.4f, 2.1f)
                lineTo(66.9f, 464f)
                horizontalLineTo(24f)
                curveToRelative(-13.2f, 0f, -24f, 10.7f, -24f, 24f)
                reflectiveCurveToRelative(10.8f, 24f, 24f, 24f)
                horizontalLineToRelative(480f)
                curveToRelative(39.7f, 0f, 72f, -32.3f, 72f, -72f)
                curveToRelative(0f, -13.2f, -10.8f, -24f, -24f, -24f)
                close()
                moveToRelative(-260.5f, 48f)
                horizontalLineToRelative(-96.9f)
                lineToRelative(43.1f, -91f)
                lineToRelative(-22f, -13f)
                curveToRelative(-12.1f, -7.2f, -21.9f, -16.9f, -29.5f, -27.8f)
                lineTo(123.7f, 464f)
                horizontalLineTo(99.5f)
                lineToRelative(52.3f, -261.4f)
                curveToRelative(4.1f, -1f, 8.1f, -2.9f, 11.7f, -5.6f)
                lineToRelative(39.7f, -30.4f)
                curveToRelative(7.7f, -5.9f, 17.4f, -8f, 25.3f, -6.1f)
                lineToRelative(14.7f, 4.4f)
                lineToRelative(-37.5f, 87.4f)
                curveToRelative(-12.6f, 29.5f, -1.3f, 64f, 26.3f, 80.3f)
                lineToRelative(85f, 50.2f)
                lineToRelative(-25.5f, 81.2f)
                close()
                moveToRelative(110.6f, 0f)
                horizontalLineToRelative(-43.6f)
                lineToRelative(23.6f, -75.5f)
                curveToRelative(5.9f, -20.8f, -2.9f, -43.1f, -21.6f, -54.4f)
                lineTo(299.3f, 298f)
                lineToRelative(31.3f, -78.3f)
                lineToRelative(20.3f, 41.4f)
                curveToRelative(8f, 16.3f, 24.9f, 26.9f, 43.1f, 26.9f)
                horizontalLineToRelative(33.3f)
                lineToRelative(-25.2f, 176f)
                close()
            }
        }.build()
        
        return _SkiingNordic!!
    }

private var _SkiingNordic: ImageVector? = null

