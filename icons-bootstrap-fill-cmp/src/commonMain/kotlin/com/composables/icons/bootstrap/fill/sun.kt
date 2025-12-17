package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Sun: ImageVector
    get() {
        if (_Sun != null) return _Sun!!
        
        _Sun = ImageVector.Builder(
            name = "sun",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 12f)
                arcToRelative(4f, 4f, 0f, true, false, 0f, -8f)
                arcToRelative(4f, 4f, 0f, false, false, 0f, 8f)
                moveTo(8f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-2f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 0f)
                moveToRelative(0f, 13f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-2f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 13f)
                moveToRelative(8f, -5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                moveTo(3f, 8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(2f)
                arcTo(0.5f, 0.5f, 0f, false, true, 3f, 8f)
                moveToRelative(10.657f, -5.657f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.707f)
                lineToRelative(-1.414f, 1.415f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.707f, -0.708f)
                lineToRelative(1.414f, -1.414f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.707f, 0f)
                moveToRelative(-9.193f, 9.193f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.707f)
                lineTo(3.05f, 13.657f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.707f, -0.707f)
                lineToRelative(1.414f, -1.414f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.707f, 0f)
                moveToRelative(9.193f, 2.121f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.707f, 0f)
                lineToRelative(-1.414f, -1.414f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.707f, -0.707f)
                lineToRelative(1.414f, 1.414f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.707f)
                moveTo(4.464f, 4.465f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.707f, 0f)
                lineTo(2.343f, 3.05f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.707f, -0.707f)
                lineToRelative(1.414f, 1.414f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.708f)
            }
        }.build()
        
        return _Sun!!
    }

private var _Sun: ImageVector? = null

