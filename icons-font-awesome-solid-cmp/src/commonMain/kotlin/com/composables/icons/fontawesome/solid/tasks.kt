package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Tasks: ImageVector
    get() {
        if (_Tasks != null) return _Tasks!!
        
        _Tasks = ImageVector.Builder(
            name = "tasks",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(139.61f, 35.5f)
                arcToRelative(12f, 12f, 0f, false, false, -17f, 0f)
                lineTo(58.93f, 98.81f)
                lineToRelative(-22.7f, -22.12f)
                arcToRelative(12f, 12f, 0f, false, false, -17f, 0f)
                lineTo(3.53f, 92.41f)
                arcToRelative(12f, 12f, 0f, false, false, 0f, 17f)
                lineToRelative(47.59f, 47.4f)
                arcToRelative(12.78f, 12.78f, 0f, false, false, 17.61f, 0f)
                lineToRelative(15.59f, -15.62f)
                lineTo(156.52f, 69f)
                arcToRelative(12.09f, 12.09f, 0f, false, false, 0.09f, -17f)
                close()
                moveToRelative(0f, 159.19f)
                arcToRelative(12f, 12f, 0f, false, false, -17f, 0f)
                lineToRelative(-63.68f, 63.72f)
                lineToRelative(-22.7f, -22.1f)
                arcToRelative(12f, 12f, 0f, false, false, -17f, 0f)
                lineTo(3.53f, 252f)
                arcToRelative(12f, 12f, 0f, false, false, 0f, 17f)
                lineTo(51f, 316.5f)
                arcToRelative(12.77f, 12.77f, 0f, false, false, 17.6f, 0f)
                lineToRelative(15.7f, -15.69f)
                lineToRelative(72.2f, -72.22f)
                arcToRelative(12f, 12f, 0f, false, false, 0.09f, -16.9f)
                close()
                moveTo(64f, 368f)
                curveToRelative(-26.49f, 0f, -48.59f, 21.5f, -48.59f, 48f)
                reflectiveCurveTo(37.53f, 464f, 64f, 464f)
                arcToRelative(48f, 48f, 0f, false, false, 0f, -96f)
                close()
                moveToRelative(432f, 16f)
                horizontalLineTo(208f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(288f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
                moveToRelative(0f, -320f)
                horizontalLineTo(208f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(288f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineTo(80f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineTo(208f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(288f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
            }
        }.build()
        
        return _Tasks!!
    }

private var _Tasks: ImageVector? = null

