package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Pencil: ImageVector
    get() {
        if (_Pencil != null) return _Pencil!!
        
        _Pencil = ImageVector.Builder(
            name = "pencil",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.146f, 0.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
                lineToRelative(3f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.708f)
                lineToRelative(-10f, 10f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.168f, 0.11f)
                lineToRelative(-5f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.65f, -0.65f)
                lineToRelative(2f, -5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.11f, -0.168f)
                close()
                moveTo(11.207f, 2.5f)
                lineTo(13.5f, 4.793f)
                lineTo(14.793f, 3.5f)
                lineTo(12.5f, 1.207f)
                close()
                moveToRelative(1.586f, 3f)
                lineTo(10.5f, 3.207f)
                lineTo(4f, 9.707f)
                verticalLineTo(10f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(0.293f)
                close()
                moveToRelative(-9.761f, 5.175f)
                lineToRelative(-0.106f, 0.106f)
                lineToRelative(-1.528f, 3.821f)
                lineToRelative(3.821f, -1.528f)
                lineToRelative(0.106f, -0.106f)
                arcTo(0.5f, 0.5f, 0f, false, true, 5f, 12.5f)
                verticalLineTo(12f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineTo(11f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.468f, -0.325f)
            }
        }.build()
        
        return _Pencil!!
    }

private var _Pencil: ImageVector? = null

