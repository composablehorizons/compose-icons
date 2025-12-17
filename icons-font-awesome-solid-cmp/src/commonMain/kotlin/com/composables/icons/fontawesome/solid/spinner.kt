package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Spinner: ImageVector
    get() {
        if (_Spinner != null) return _Spinner!!
        
        _Spinner = ImageVector.Builder(
            name = "spinner",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(304f, 48f)
                curveToRelative(0f, 26.51f, -21.49f, 48f, -48f, 48f)
                reflectiveCurveToRelative(-48f, -21.49f, -48f, -48f)
                reflectiveCurveToRelative(21.49f, -48f, 48f, -48f)
                reflectiveCurveToRelative(48f, 21.49f, 48f, 48f)
                close()
                moveToRelative(-48f, 368f)
                curveToRelative(-26.51f, 0f, -48f, 21.49f, -48f, 48f)
                reflectiveCurveToRelative(21.49f, 48f, 48f, 48f)
                reflectiveCurveToRelative(48f, -21.49f, 48f, -48f)
                reflectiveCurveToRelative(-21.49f, -48f, -48f, -48f)
                close()
                moveToRelative(208f, -208f)
                curveToRelative(-26.51f, 0f, -48f, 21.49f, -48f, 48f)
                reflectiveCurveToRelative(21.49f, 48f, 48f, 48f)
                reflectiveCurveToRelative(48f, -21.49f, 48f, -48f)
                reflectiveCurveToRelative(-21.49f, -48f, -48f, -48f)
                close()
                moveTo(96f, 256f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                reflectiveCurveTo(0f, 229.49f, 0f, 256f)
                reflectiveCurveToRelative(21.49f, 48f, 48f, 48f)
                reflectiveCurveToRelative(48f, -21.49f, 48f, -48f)
                close()
                moveToRelative(12.922f, 99.078f)
                curveToRelative(-26.51f, 0f, -48f, 21.49f, -48f, 48f)
                reflectiveCurveToRelative(21.49f, 48f, 48f, 48f)
                reflectiveCurveToRelative(48f, -21.49f, 48f, -48f)
                curveToRelative(0f, -26.509f, -21.491f, -48f, -48f, -48f)
                close()
                moveToRelative(294.156f, 0f)
                curveToRelative(-26.51f, 0f, -48f, 21.49f, -48f, 48f)
                reflectiveCurveToRelative(21.49f, 48f, 48f, 48f)
                reflectiveCurveToRelative(48f, -21.49f, 48f, -48f)
                curveToRelative(0f, -26.509f, -21.49f, -48f, -48f, -48f)
                close()
                moveTo(108.922f, 60.922f)
                curveToRelative(-26.51f, 0f, -48f, 21.49f, -48f, 48f)
                reflectiveCurveToRelative(21.49f, 48f, 48f, 48f)
                reflectiveCurveToRelative(48f, -21.49f, 48f, -48f)
                reflectiveCurveToRelative(-21.491f, -48f, -48f, -48f)
                close()
            }
        }.build()
        
        return _Spinner!!
    }

private var _Spinner: ImageVector? = null

