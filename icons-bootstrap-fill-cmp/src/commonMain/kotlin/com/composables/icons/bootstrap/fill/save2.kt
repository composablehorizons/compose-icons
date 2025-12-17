package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Save2: ImageVector
    get() {
        if (_Save2 != null) return _Save2!!
        
        _Save2 = ImageVector.Builder(
            name = "save2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 1.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 10f, 0f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(6f)
                curveToRelative(-0.314f, 0.418f, -0.5f, 0.937f, -0.5f, 1.5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.354f, 0.854f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0f)
                lineToRelative(2.5f, -2.5f)
                arcTo(0.5f, 0.5f, 0f, false, false, 10.5f, 7.5f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Save2!!
    }

private var _Save2: ImageVector? = null

