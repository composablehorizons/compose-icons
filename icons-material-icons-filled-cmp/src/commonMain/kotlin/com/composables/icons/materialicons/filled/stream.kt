package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Stream: ImageVector
    get() {
        if (_Stream != null) return _Stream!!
        
        _Stream = ImageVector.Builder(
            name = "stream",
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
                moveTo(22f, 12f)
                arcTo(2f, 2f, 0f, false, true, 20f, 14f)
                arcTo(2f, 2f, 0f, false, true, 18f, 12f)
                arcTo(2f, 2f, 0f, false, true, 22f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 12f)
                arcTo(2f, 2f, 0f, false, true, 4f, 14f)
                arcTo(2f, 2f, 0f, false, true, 2f, 12f)
                arcTo(2f, 2f, 0f, false, true, 6f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 20f)
                arcTo(2f, 2f, 0f, false, true, 12f, 22f)
                arcTo(2f, 2f, 0f, false, true, 10f, 20f)
                arcTo(2f, 2f, 0f, false, true, 14f, 20f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.05f, 8.59f)
                lineTo(6.03f, 4.55f)
                horizontalLineToRelative(-0.01f)
                lineToRelative(-0.31f, -0.32f)
                lineToRelative(-1.42f, 1.41f)
                lineToRelative(4.02f, 4.05f)
                lineToRelative(0.01f, -0.01f)
                lineToRelative(0.31f, 0.32f)
                close()
                moveToRelative(3.893f, 0.027f)
                lineToRelative(4.405f, -4.392f)
                lineTo(19.76f, 5.64f)
                lineToRelative(-4.405f, 4.393f)
                close()
                moveTo(10.01f, 15.36f)
                lineToRelative(-1.42f, -1.41f)
                lineToRelative(-4.03f, 4.01f)
                lineToRelative(-0.32f, 0.33f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(4.03f, -4.02f)
                close()
                moveToRelative(9.75f, 2.94f)
                lineToRelative(-3.99f, -4.01f)
                lineToRelative(-0.36f, -0.35f)
                lineTo(14f, 15.35f)
                lineToRelative(3.99f, 4.01f)
                lineToRelative(0.35f, 0.35f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 4f)
                arcTo(2f, 2f, 0f, false, true, 12f, 6f)
                arcTo(2f, 2f, 0f, false, true, 10f, 4f)
                arcTo(2f, 2f, 0f, false, true, 14f, 4f)
                close()
            }
        }.build()
        
        return _Stream!!
    }

private var _Stream: ImageVector? = null

