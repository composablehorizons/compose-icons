package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Satellite: ImageVector
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
                moveTo(5f, 19f)
                horizontalLineToRelative(14f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineToRelative(14f)
                close()
                moveTo(6f, 6f)
                horizontalLineToRelative(2.57f)
                curveToRelative(0f, 1.42f, -1.15f, 2.58f, -2.57f, 2.58f)
                verticalLineTo(6f)
                close()
                moveToRelative(0f, 4.29f)
                curveToRelative(2.37f, 0f, 4.28f, -1.93f, 4.28f, -4.29f)
                horizontalLineTo(12f)
                curveToRelative(0f, 3.31f, -2.68f, 6f, -6f, 6f)
                verticalLineToRelative(-1.71f)
                close()
                moveToRelative(3f, 2.86f)
                lineToRelative(2.14f, 2.58f)
                lineToRelative(3f, -3.86f)
                lineTo(18f, 17f)
                horizontalLineTo(6f)
                lineToRelative(3f, -3.85f)
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
                horizontalLineToRelative(-1.72f)
                curveToRelative(0f, 2.36f, -1.91f, 4.29f, -4.28f, 4.29f)
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

