package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Hive: ImageVector
    get() {
        if (_Hive != null) return _Hive!!
        
        _Hive = ImageVector.Builder(
            name = "hive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(21.5f, 9f)
                    lineToRelative(-2.25f, -4f)
                    horizontalLineToRelative(-3.31f)
                    lineToRelative(-1.69f, -3f)
                    horizontalLineToRelative(-4.5f)
                    lineTo(8.06f, 5f)
                    horizontalLineTo(4.75f)
                    lineTo(2.5f, 9f)
                    lineToRelative(1.69f, 3f)
                    lineTo(2.5f, 15f)
                    lineToRelative(2.25f, 4f)
                    horizontalLineToRelative(3.31f)
                    lineToRelative(1.69f, 3f)
                    horizontalLineToRelative(4.5f)
                    lineToRelative(1.69f, -3f)
                    horizontalLineToRelative(3.31f)
                    lineToRelative(2.25f, -4f)
                    lineToRelative(-1.69f, -3f)
                    lineTo(21.5f, 9f)
                    close()
                    moveTo(19.21f, 9f)
                    lineToRelative(-1.12f, 2f)
                    horizontalLineToRelative(-2.14f)
                    lineToRelative(-1.12f, -2f)
                    lineToRelative(1.12f, -2f)
                    horizontalLineToRelative(2.14f)
                    lineTo(19.21f, 9f)
                    close()
                    moveTo(10.94f, 14f)
                    lineToRelative(-1.12f, -2f)
                    lineToRelative(1.12f, -2f)
                    horizontalLineToRelative(2.12f)
                    lineToRelative(1.12f, 2f)
                    lineToRelative(-1.12f, 2f)
                    horizontalLineTo(10.94f)
                    close()
                    moveTo(13.08f, 4f)
                    lineToRelative(1.12f, 1.98f)
                    lineTo(13.06f, 8f)
                    horizontalLineToRelative(-2.12f)
                    lineTo(9.8f, 5.98f)
                    lineTo(10.92f, 4f)
                    horizontalLineTo(13.08f)
                    close()
                    moveTo(5.92f, 7f)
                    horizontalLineToRelative(2.14f)
                    lineToRelative(1.12f, 2f)
                    lineToRelative(-1.12f, 2f)
                    horizontalLineTo(5.92f)
                    lineTo(4.79f, 9f)
                    lineTo(5.92f, 7f)
                    close()
                    moveTo(4.79f, 15f)
                    lineToRelative(1.12f, -2f)
                    horizontalLineToRelative(2.14f)
                    lineToRelative(1.12f, 2f)
                    lineToRelative(-1.12f, 2f)
                    horizontalLineTo(5.92f)
                    lineTo(4.79f, 15f)
                    close()
                    moveTo(10.92f, 20f)
                    lineTo(9.8f, 18.02f)
                    lineTo(10.94f, 16f)
                    horizontalLineToRelative(2.12f)
                    lineToRelative(1.13f, 2.02f)
                    lineTo(13.08f, 20f)
                    horizontalLineTo(10.92f)
                    close()
                    moveTo(18.08f, 17f)
                    horizontalLineToRelative(-2.14f)
                    lineToRelative(-1.12f, -2f)
                    lineToRelative(1.12f, -2f)
                    horizontalLineToRelative(2.14f)
                    lineToRelative(1.12f, 2f)
                    lineTo(18.08f, 17f)
                    close()
                }
            }
        }.build()
        
        return _Hive!!
    }

private var _Hive: ImageVector? = null

