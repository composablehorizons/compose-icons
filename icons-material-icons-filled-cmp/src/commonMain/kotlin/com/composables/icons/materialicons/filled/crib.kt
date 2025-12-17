package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Crib: ImageVector
    get() {
        if (_Crib != null) return _Crib!!
        
        _Crib = ImageVector.Builder(
            name = "crib",
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
                moveTo(18f, 9f)
                horizontalLineToRelative(-6f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                curveTo(5.79f, 4f, 4f, 5.79f, 4f, 8f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.93f)
                curveToRelative(-0.61f, -0.35f, -1.16f, -0.78f, -1.65f, -1.27f)
                lineToRelative(-1.42f, 1.42f)
                curveTo(6.74f, 20.88f, 9.24f, 22f, 12f, 22f)
                curveToRelative(2.76f, 0f, 5.26f, -1.12f, 7.07f, -2.93f)
                lineToRelative(-1.42f, -1.42f)
                curveToRelative(-0.49f, 0.49f, -1.05f, 0.92f, -1.65f, 1.27f)
                verticalLineTo(16f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-3f)
                curveTo(20f, 9.9f, 19.1f, 9f, 18f, 9f)
                close()
                moveTo(14f, 19.75f)
                curveTo(13.36f, 19.91f, 12.69f, 20f, 12f, 20f)
                curveToRelative(-0.69f, 0f, -1.36f, -0.09f, -2f, -0.25f)
                verticalLineTo(16f)
                horizontalLineToRelative(4f)
                verticalLineTo(19.75f)
                close()
            }
        }.build()
        
        return _Crib!!
    }

private var _Crib: ImageVector? = null

