package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Recommend: ImageVector
    get() {
        if (_Recommend != null) return _Recommend!!
        
        _Recommend = ImageVector.Builder(
            name = "recommend",
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
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                arcToRelative(10f, 10f, 0f, true, false, 10f, 10f)
                arcTo(10f, 10f, 0f, false, false, 12f, 2f)
                close()
                moveToRelative(6f, 9.8f)
                arcToRelative(0.9f, 0.9f, 0f, false, true, -0.1f, 0.5f)
                lineToRelative(-2.1f, 4.9f)
                arcToRelative(1.34f, 1.34f, 0f, false, true, -1.3f, 0.8f)
                horizontalLineTo(9f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-5f)
                arcToRelative(1.28f, 1.28f, 0f, false, true, 0.4f, -1f)
                lineTo(12f, 5f)
                lineToRelative(0.69f, 0.69f)
                arcToRelative(1.08f, 1.08f, 0f, false, true, 0.3f, 0.7f)
                verticalLineToRelative(0.2f)
                lineTo(12.41f, 10f)
                horizontalLineTo(17f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                close()
            }
        }.build()
        
        return _Recommend!!
    }

private var _Recommend: ImageVector? = null

