package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.HouseCheck: ImageVector
    get() {
        if (_HouseCheck != null) return _HouseCheck!!
        
        _HouseCheck = ImageVector.Builder(
            name = "house-check",
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
                lineToRelative(4.712f, 4.712f)
                arcTo(4.5f, 4.5f, 0f, false, false, 8.758f, 15f)
                horizontalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2f, 13.5f)
                verticalLineTo(9.293f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 16f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, 0f, -7f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 0f, 7f)
                moveToRelative(1.679f, -4.493f)
                lineToRelative(-1.335f, 2.226f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.174f, 0.144f)
                lineToRelative(-0.774f, -0.773f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, -0.707f)
                lineToRelative(0.547f, 0.547f)
                lineToRelative(1.17f, -1.951f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.858f, 0.514f)
            }
        }.build()
        
        return _HouseCheck!!
    }

private var _HouseCheck: ImageVector? = null

