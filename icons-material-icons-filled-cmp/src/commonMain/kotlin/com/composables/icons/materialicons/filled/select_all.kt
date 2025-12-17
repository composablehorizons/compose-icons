package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Select_all: ImageVector
    get() {
        if (_Select_all != null) return _Select_all!!
        
        _Select_all = ImageVector.Builder(
            name = "select_all",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 5f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                close()
                moveToRelative(0f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(4f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(7f)
                verticalLineToRelative(2f)
                close()
                moveTo(3f, 9f)
                horizontalLineToRelative(2f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(10f, -6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                close()
                moveToRelative(6f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(5f, 21f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                close()
                moveToRelative(-2f, -4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                close()
                moveTo(9f, 3f)
                horizontalLineTo(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                close()
                moveToRelative(2f, 18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(8f, -8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, 8f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -12f)
                horizontalLineToRelative(2f)
                verticalLineTo(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(-4f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -16f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveTo(7f, 17f)
                horizontalLineToRelative(10f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineToRelative(10f)
                close()
                moveToRelative(2f, -8f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                close()
            }
        }.build()
        
        return _Select_all!!
    }

private var _Select_all: ImageVector? = null

