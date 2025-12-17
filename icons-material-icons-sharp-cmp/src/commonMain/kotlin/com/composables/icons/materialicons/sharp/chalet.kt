package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Chalet: ImageVector
    get() {
        if (_Chalet != null) return _Chalet!!
        
        _Chalet = ImageVector.Builder(
            name = "chalet",
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
                moveTo(10f, 7.5f)
                lineToRelative(7.5f, 7.5f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(15f, 15.33f)
                verticalLineTo(20f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-5f)
                horizontalLineTo(9f)
                verticalLineToRelative(5f)
                horizontalLineTo(5f)
                verticalLineToRelative(-4.67f)
                lineToRelative(-1.09f, 1.09f)
                lineTo(2.5f, 15f)
                lineTo(10f, 7.5f)
                close()
                moveTo(22f, 6.5f)
                horizontalLineToRelative(-1.19f)
                lineToRelative(0.75f, -0.75f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(19.39f, 6.5f)
                horizontalLineTo(18.5f)
                verticalLineTo(5.61f)
                lineToRelative(1.45f, -1.45f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(18.5f, 4.19f)
                verticalLineTo(3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1.19f)
                lineToRelative(-0.75f, -0.75f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(1.45f, 1.45f)
                verticalLineTo(6.5f)
                horizontalLineToRelative(-0.89f)
                lineToRelative(-1.45f, -1.45f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(0.75f, 0.75f)
                horizontalLineTo(14f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.19f)
                lineToRelative(-0.75f, 0.75f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(1.45f, -1.45f)
                horizontalLineToRelative(0.89f)
                verticalLineToRelative(0.89f)
                lineToRelative(-1.45f, 1.45f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(0.75f, -0.75f)
                verticalLineTo(11f)
                horizontalLineToRelative(1f)
                verticalLineTo(9.81f)
                lineToRelative(0.75f, 0.75f)
                lineToRelative(0.71f, -0.71f)
                lineTo(18.5f, 8.39f)
                verticalLineTo(7.5f)
                horizontalLineToRelative(0.89f)
                lineToRelative(1.45f, 1.45f)
                lineToRelative(0.71f, -0.71f)
                lineTo(20.81f, 7.5f)
                horizontalLineTo(22f)
                verticalLineTo(6.5f)
                close()
            }
        }.build()
        
        return _Chalet!!
    }

private var _Chalet: ImageVector? = null

