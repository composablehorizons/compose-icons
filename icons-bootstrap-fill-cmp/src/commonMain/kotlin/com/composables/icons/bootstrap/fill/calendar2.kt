package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Calendar2: ImageVector
    get() {
        if (_Calendar2 != null) return _Calendar2!!
        
        _Calendar2 = ImageVector.Builder(
            name = "calendar2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineTo(1f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(11f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-1f)
                verticalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineTo(1f)
                horizontalLineTo(4f)
                close()
                moveTo(2.545f, 3f)
                horizontalLineToRelative(10.91f)
                curveToRelative(0.3f, 0f, 0.545f, 0.224f, 0.545f, 0.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.276f, -0.244f, 0.5f, -0.546f, 0.5f)
                horizontalLineTo(2.545f)
                curveTo(2.245f, 5f, 2f, 4.776f, 2f, 4.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.276f, 0.244f, -0.5f, 0.545f, -0.5f)
            }
        }.build()
        
        return _Calendar2!!
    }

private var _Calendar2: ImageVector? = null

