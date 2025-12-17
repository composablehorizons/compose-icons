package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.HouseLock: ImageVector
    get() {
        if (_HouseLock != null) return _HouseLock!!
        
        _HouseLock = ImageVector.Builder(
            name = "house-lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.707f, 1.5f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                lineTo(0.646f, 8.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0.708f)
                lineTo(8f, 2.207f)
                lineToRelative(6.646f, 6.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, -0.708f)
                lineTo(13f, 5.793f)
                verticalLineTo(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1.293f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 3.293f)
                lineToRelative(4.72f, 4.72f)
                arcToRelative(3f, 3f, 0f, false, false, -2.709f, 3.248f)
                arcTo(2f, 2f, 0f, false, false, 9f, 13f)
                verticalLineToRelative(2f)
                horizontalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2f, 13.5f)
                verticalLineTo(9.293f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 9f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                moveToRelative(0f, 1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
            }
        }.build()
        
        return _HouseLock!!
    }

private var _HouseLock: ImageVector? = null

