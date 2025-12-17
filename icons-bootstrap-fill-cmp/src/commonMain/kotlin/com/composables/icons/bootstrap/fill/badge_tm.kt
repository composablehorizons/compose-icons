package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.BadgeTm: ImageVector
    get() {
        if (_BadgeTm != null) return _BadgeTm!!
        
        _BadgeTm = ImageVector.Builder(
            name = "badge-tm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveToRelative(3.295f, 3.995f)
                verticalLineTo(11f)
                horizontalLineTo(4.104f)
                verticalLineTo(5.995f)
                horizontalLineToRelative(-1.7f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineToRelative(0.994f)
                horizontalLineTo(5.295f)
                close()
                moveTo(8.692f, 7.01f)
                verticalLineTo(11f)
                horizontalLineTo(7.633f)
                verticalLineTo(5.001f)
                horizontalLineToRelative(1.209f)
                lineToRelative(1.71f, 3.894f)
                horizontalLineToRelative(0.039f)
                lineToRelative(1.71f, -3.894f)
                horizontalLineTo(13.5f)
                verticalLineTo(11f)
                horizontalLineToRelative(-1.072f)
                verticalLineTo(7.01f)
                horizontalLineToRelative(-0.057f)
                lineToRelative(-1.42f, 3.239f)
                horizontalLineToRelative(-0.773f)
                lineTo(8.75f, 7.008f)
                horizontalLineToRelative(-0.058f)
                close()
            }
        }.build()
        
        return _BadgeTm!!
    }

private var _BadgeTm: ImageVector? = null

