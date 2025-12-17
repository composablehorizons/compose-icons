package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Hospital: ImageVector
    get() {
        if (_Hospital != null) return _Hospital!!
        
        _Hospital = ImageVector.Builder(
            name = "hospital",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(16f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(8f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-3f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
                moveToRelative(2.5f, 5.034f)
                verticalLineToRelative(1.1f)
                lineToRelative(0.953f, -0.55f)
                lineToRelative(0.5f, 0.867f)
                lineTo(9f, 7f)
                lineToRelative(0.953f, 0.55f)
                lineToRelative(-0.5f, 0.866f)
                lineToRelative(-0.953f, -0.55f)
                verticalLineToRelative(1.1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1.1f)
                lineToRelative(-0.953f, 0.55f)
                lineToRelative(-0.5f, -0.866f)
                lineTo(7f, 7f)
                lineToRelative(-0.953f, -0.55f)
                lineToRelative(0.5f, -0.866f)
                lineToRelative(0.953f, 0.55f)
                verticalLineToRelative(-1.1f)
                close()
                moveTo(2.25f, 9f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-0.5f)
                arcTo(0.25f, 0.25f, 0f, false, true, 2f, 9.75f)
                verticalLineToRelative(-0.5f)
                arcTo(0.25f, 0.25f, 0f, false, true, 2.25f, 9f)
                moveToRelative(0f, 2f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, -0.25f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, -0.25f)
                moveTo(2f, 13.25f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, -0.25f)
                close()
                moveTo(13.25f, 9f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, -0.25f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, -0.25f)
                moveTo(13f, 11.25f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, -0.25f)
                close()
                moveToRelative(0.25f, 1.75f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, -0.25f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, -0.25f)
            }
        }.build()
        
        return _Hospital!!
    }

private var _Hospital: ImageVector? = null

