package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Percent: ImageVector
    get() {
        if (_Percent != null) return _Percent!!
        
        _Percent = ImageVector.Builder(
            name = "percent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(112f, 224f)
                curveToRelative(61.9f, 0f, 112f, -50.1f, 112f, -112f)
                reflectiveCurveTo(173.9f, 0f, 112f, 0f)
                reflectiveCurveTo(0f, 50.1f, 0f, 112f)
                reflectiveCurveToRelative(50.1f, 112f, 112f, 112f)
                close()
                moveToRelative(0f, -160f)
                curveToRelative(26.5f, 0f, 48f, 21.5f, 48f, 48f)
                reflectiveCurveToRelative(-21.5f, 48f, -48f, 48f)
                reflectiveCurveToRelative(-48f, -21.5f, -48f, -48f)
                reflectiveCurveToRelative(21.5f, -48f, 48f, -48f)
                close()
                moveToRelative(224f, 224f)
                curveToRelative(-61.9f, 0f, -112f, 50.1f, -112f, 112f)
                reflectiveCurveToRelative(50.1f, 112f, 112f, 112f)
                reflectiveCurveToRelative(112f, -50.1f, 112f, -112f)
                reflectiveCurveToRelative(-50.1f, -112f, -112f, -112f)
                close()
                moveToRelative(0f, 160f)
                curveToRelative(-26.5f, 0f, -48f, -21.5f, -48f, -48f)
                reflectiveCurveToRelative(21.5f, -48f, 48f, -48f)
                reflectiveCurveToRelative(48f, 21.5f, 48f, 48f)
                reflectiveCurveToRelative(-21.5f, 48f, -48f, 48f)
                close()
                moveTo(392.3f, 0.2f)
                lineToRelative(31.6f, -0.1f)
                curveToRelative(19.4f, -0.1f, 30.9f, 21.8f, 19.7f, 37.8f)
                lineTo(77.4f, 501.6f)
                arcToRelative(23.95f, 23.95f, 0f, false, true, -19.6f, 10.2f)
                lineToRelative(-33.4f, 0.1f)
                curveToRelative(-19.5f, 0f, -30.9f, -21.9f, -19.7f, -37.8f)
                lineToRelative(368f, -463.7f)
                curveTo(377.2f, 4f, 384.5f, 0.2f, 392.3f, 0.2f)
                close()
            }
        }.build()
        
        return _Percent!!
    }

private var _Percent: ImageVector? = null

