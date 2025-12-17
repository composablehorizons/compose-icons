package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.StopCircle: ImageVector
    get() {
        if (_StopCircle != null) return _StopCircle!!
        
        _StopCircle = ImageVector.Builder(
            name = "stop-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.25f, 12f)
                curveToRelative(0f, -5.385f, 4.365f, -9.75f, 9.75f, -9.75f)
                reflectiveCurveToRelative(9.75f, 4.365f, 9.75f, 9.75f)
                reflectiveCurveToRelative(-4.365f, 9.75f, -9.75f, 9.75f)
                reflectiveCurveTo(2.25f, 17.385f, 2.25f, 12f)
                close()
                moveToRelative(6f, -2.438f)
                curveToRelative(0f, -0.724f, 0.588f, -1.312f, 1.313f, -1.312f)
                horizontalLineToRelative(4.874f)
                curveToRelative(0.725f, 0f, 1.313f, 0.588f, 1.313f, 1.313f)
                verticalLineToRelative(4.874f)
                curveToRelative(0f, 0.725f, -0.588f, 1.313f, -1.313f, 1.313f)
                horizontalLineTo(9.564f)
                arcToRelative(1.312f, 1.312f, 0f, false, true, -1.313f, -1.313f)
                verticalLineTo(9.564f)
                close()
            }
        }.build()
        
        return _StopCircle!!
    }

private var _StopCircle: ImageVector? = null

