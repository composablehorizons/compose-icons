package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Gite: ImageVector
    get() {
        if (_Gite != null) return _Gite!!
        
        _Gite = ImageVector.Builder(
            name = "gite",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21.41f, 9.41f)
                lineToRelative(-2.83f, -2.83f)
                curveTo(18.21f, 6.21f, 17.7f, 6f, 17.17f, 6f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveTo(7f, 4.45f, 7f, 5f)
                verticalLineToRelative(1f)
                horizontalLineTo(6.83f)
                curveTo(6.3f, 6f, 5.79f, 6.21f, 5.41f, 6.59f)
                lineTo(2.59f, 9.41f)
                curveTo(2.21f, 9.79f, 2f, 10.3f, 2f, 10.83f)
                verticalLineTo(17f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-6.17f)
                curveTo(22f, 10.3f, 21.79f, 9.79f, 21.41f, 9.41f)
                close()
                moveTo(14f, 17f)
                horizontalLineTo(4f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(10f)
                verticalLineTo(17f)
                close()
                moveTo(20f, 17f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-6.17f)
                lineToRelative(2f, -2f)
                lineToRelative(2f, 2f)
                verticalLineTo(17f)
                close()
            }
        }.build()
        
        return _Gite!!
    }

private var _Gite: ImageVector? = null

