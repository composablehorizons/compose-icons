package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Calendar2Range: ImageVector
    get() {
        if (_Calendar2Range != null) return _Calendar2Range!!
        
        _Calendar2Range = ImageVector.Builder(
            name = "calendar2-range",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(1f)
                horizontalLineToRelative(8f)
                verticalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineTo(1f)
                horizontalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(11f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(1f)
                verticalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                moveToRelative(9.954f, 3f)
                horizontalLineTo(2.545f)
                curveToRelative(-0.3f, 0f, -0.545f, 0.224f, -0.545f, 0.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.276f, 0.244f, 0.5f, 0.545f, 0.5f)
                horizontalLineToRelative(10.91f)
                curveToRelative(0.3f, 0f, 0.545f, -0.224f, 0.545f, -0.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.276f, -0.244f, -0.5f, -0.546f, -0.5f)
                moveTo(10f, 7f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                horizontalLineToRelative(5f)
                verticalLineTo(7f)
                close()
                moveToRelative(-4f, 4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
            }
        }.build()
        
        return _Calendar2Range!!
    }

private var _Calendar2Range: ImageVector? = null

