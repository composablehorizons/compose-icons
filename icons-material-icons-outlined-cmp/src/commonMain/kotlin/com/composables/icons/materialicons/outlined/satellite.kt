package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Satellite: ImageVector
    get() {
        if (_Satellite != null) return _Satellite!!
        
        _Satellite = ImageVector.Builder(
            name = "satellite",
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
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 16f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(14f)
                close()
                moveTo(8.57f, 6f)
                horizontalLineTo(6f)
                verticalLineToRelative(2.58f)
                curveToRelative(1.42f, 0f, 2.57f, -1.16f, 2.57f, -2.58f)
                close()
                moveTo(12f, 6f)
                horizontalLineToRelative(-1.71f)
                curveToRelative(0f, 2.36f, -1.92f, 4.29f, -4.29f, 4.29f)
                verticalLineTo(12f)
                curveToRelative(3.32f, 0f, 6f, -2.69f, 6f, -6f)
                close()
                moveToRelative(2.14f, 5.86f)
                lineToRelative(-3f, 3.87f)
                lineTo(9f, 13.15f)
                lineTo(6f, 17f)
                horizontalLineToRelative(12f)
                close()
            }
        }.build()
        
        return _Satellite!!
    }

private var _Satellite: ImageVector? = null

