package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Eject: ImageVector
    get() {
        if (_Eject != null) return _Eject!!
        
        _Eject = ImageVector.Builder(
            name = "eject",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 17f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineTo(6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveToRelative(5.17f, -10.75f)
                lineToRelative(-4.8f, 7.2f)
                curveToRelative(-0.45f, 0.66f, 0.03f, 1.55f, 0.83f, 1.55f)
                horizontalLineToRelative(9.6f)
                curveToRelative(0.8f, 0f, 1.28f, -0.89f, 0.83f, -1.55f)
                lineToRelative(-4.8f, -7.2f)
                curveToRelative(-0.39f, -0.6f, -1.27f, -0.6f, -1.66f, 0f)
                close()
            }
        }.build()
        
        return _Eject!!
    }

private var _Eject: ImageVector? = null

