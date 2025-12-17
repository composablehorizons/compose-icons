package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Crib: ImageVector
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
                moveTo(18.32f, 18.32f)
                curveToRelative(-0.36f, -0.36f, -0.92f, -0.4f, -1.31f, -0.08f)
                curveToRelative(-0.32f, 0.25f, -0.65f, 0.48f, -1f, 0.69f)
                verticalLineTo(16f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-6f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(8f)
                curveTo(5.79f, 4f, 4f, 5.79f, 4f, 8f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.93f)
                curveToRelative(-0.35f, -0.2f, -0.69f, -0.43f, -1f, -0.69f)
                curveToRelative(-0.39f, -0.32f, -0.96f, -0.27f, -1.31f, 0.08f)
                curveToRelative(-0.42f, 0.42f, -0.39f, 1.12f, 0.08f, 1.5f)
                curveTo(7.47f, 21.18f, 9.64f, 22f, 12f, 22f)
                curveToRelative(2.36f, 0f, 4.53f, -0.82f, 6.24f, -2.18f)
                curveTo(18.71f, 19.44f, 18.74f, 18.74f, 18.32f, 18.32f)
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

