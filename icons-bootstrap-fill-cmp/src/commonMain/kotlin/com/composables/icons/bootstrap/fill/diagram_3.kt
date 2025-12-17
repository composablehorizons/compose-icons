package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Diagram3: ImageVector
    get() {
        if (_Diagram3 != null) return _Diagram3!!
        
        _Diagram3 = ImageVector.Builder(
            name = "diagram-3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 3.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 7.5f, 2f)
                horizontalLineToRelative(1f)
                arcTo(1.5f, 1.5f, 0f, false, true, 10f, 3.5f)
                verticalLineToRelative(1f)
                arcTo(1.5f, 1.5f, 0f, false, true, 8.5f, 6f)
                verticalLineToRelative(1f)
                horizontalLineTo(14f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(8f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(8f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-1f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2f, 7f)
                horizontalLineToRelative(5.5f)
                verticalLineTo(6f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6f, 4.5f)
                close()
                moveToRelative(-6f, 8f)
                arcTo(1.5f, 1.5f, 0f, false, true, 1.5f, 10f)
                horizontalLineToRelative(1f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4f, 11.5f)
                verticalLineToRelative(1f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2.5f, 14f)
                horizontalLineToRelative(-1f)
                arcTo(1.5f, 1.5f, 0f, false, true, 0f, 12.5f)
                close()
                moveToRelative(6f, 0f)
                arcTo(1.5f, 1.5f, 0f, false, true, 7.5f, 10f)
                horizontalLineToRelative(1f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(1f)
                arcTo(1.5f, 1.5f, 0f, false, true, 8.5f, 14f)
                horizontalLineToRelative(-1f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6f, 12.5f)
                close()
                moveToRelative(6f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.5f, -1.5f)
                horizontalLineToRelative(1f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(1f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-1f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, -1.5f)
                close()
            }
        }.build()
        
        return _Diagram3!!
    }

private var _Diagram3: ImageVector? = null

