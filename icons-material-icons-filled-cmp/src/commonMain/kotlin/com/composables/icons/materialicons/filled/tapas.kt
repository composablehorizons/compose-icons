package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Tapas: ImageVector
    get() {
        if (_Tapas != null) return _Tapas!!
        
        _Tapas = ImageVector.Builder(
            name = "tapas",
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
                moveTo(22f, 10f)
                verticalLineTo(1f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 1.86f, 1.28f, 3.41f, 3f, 3.86f)
                verticalLineTo(21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7.14f)
                curveTo(20.72f, 13.41f, 22f, 11.86f, 22f, 10f)
                close()
                moveTo(20f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineTo(3f)
                horizontalLineTo(20f)
                close()
                moveTo(12.5f, 11.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineTo(8f)
                verticalLineToRelative(9f)
                horizontalLineTo(6f)
                verticalLineToRelative(-9f)
                horizontalLineTo(4f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                curveTo(1.5f, 10.12f, 2.62f, 9f, 4f, 9f)
                horizontalLineToRelative(2f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                curveTo(2.62f, 8f, 1.5f, 6.88f, 1.5f, 5.5f)
                curveTo(1.5f, 4.12f, 2.62f, 3f, 4f, 3f)
                horizontalLineToRelative(2f)
                verticalLineTo(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                curveTo(12.5f, 6.88f, 11.38f, 8f, 10f, 8f)
                horizontalLineTo(8f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                curveTo(11.38f, 9f, 12.5f, 10.12f, 12.5f, 11.5f)
                close()
            }
        }.build()
        
        return _Tapas!!
    }

private var _Tapas: ImageVector? = null

