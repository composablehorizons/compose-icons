package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Backpack: ImageVector
    get() {
        if (_Backpack != null) return _Backpack!!
        
        _Backpack = ImageVector.Builder(
            name = "backpack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 0f)
                curveTo(9.55229f, 0f, 10f, 0.447715f, 10f, 1f)
                verticalLineTo(2f)
                horizontalLineTo(14f)
                curveTo(14.5523f, 2f, 15f, 2.44772f, 15f, 3f)
                verticalLineTo(6f)
                curveTo(15f, 6.88839f, 14.6126f, 7.68566f, 14f, 8.23438f)
                verticalLineTo(11.5f)
                curveTo(14f, 12.3284f, 13.3284f, 13f, 12.5f, 13f)
                horizontalLineTo(2.5f)
                curveTo(1.67157f, 13f, 1f, 12.3284f, 1f, 11.5f)
                verticalLineTo(8.2334f)
                curveTo(0.387691f, 7.68474f, 0f, 6.88823f, 0f, 6f)
                verticalLineTo(3f)
                curveTo(0f, 2.44772f, 0.447715f, 2f, 1f, 2f)
                horizontalLineTo(5f)
                verticalLineTo(1f)
                curveTo(5f, 0.447715f, 5.44772f, 0f, 6f, 0f)
                horizontalLineTo(9f)
                close()
                moveTo(13f, 8.82715f)
                curveTo(12.6869f, 8.93792f, 12.3506f, 9f, 12f, 9f)
                horizontalLineTo(8f)
                verticalLineTo(9.5f)
                curveTo(8f, 9.77614f, 7.77614f, 10f, 7.5f, 10f)
                curveTo(7.22386f, 10f, 7f, 9.77614f, 7f, 9.5f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                curveTo(2.64938f, 9f, 2.31309f, 8.93795f, 2f, 8.82715f)
                verticalLineTo(11.5f)
                curveTo(2f, 11.7761f, 2.22386f, 12f, 2.5f, 12f)
                horizontalLineTo(12.5f)
                curveTo(12.7761f, 12f, 13f, 11.7761f, 13f, 11.5f)
                verticalLineTo(8.82715f)
                close()
                moveTo(1f, 6f)
                curveTo(1f, 6.65391f, 1.31294f, 7.23483f, 1.7998f, 7.60059f)
                lineTo(1.92969f, 7.68945f)
                curveTo(2.23914f, 7.88604f, 2.60573f, 8f, 3f, 8f)
                horizontalLineTo(7f)
                verticalLineTo(7.5f)
                curveTo(7f, 7.22386f, 7.22386f, 7f, 7.5f, 7f)
                curveTo(7.77614f, 7f, 8f, 7.22386f, 8f, 7.5f)
                verticalLineTo(8f)
                horizontalLineTo(12f)
                curveTo(12.4508f, 8f, 12.866f, 7.85163f, 13.2002f, 7.60059f)
                lineTo(13.374f, 7.45312f)
                curveTo(13.7601f, 7.08804f, 14f, 6.57214f, 14f, 6f)
                verticalLineTo(3f)
                horizontalLineTo(1f)
                verticalLineTo(6f)
                close()
                moveTo(6f, 2f)
                horizontalLineTo(9f)
                verticalLineTo(1f)
                horizontalLineTo(6f)
                verticalLineTo(2f)
                close()
            }
        }.build()
        
        return _Backpack!!
    }

private var _Backpack: ImageVector? = null

