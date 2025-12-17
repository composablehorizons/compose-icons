package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Houses: ImageVector
    get() {
        if (_Houses != null) return _Houses!!
        
        _Houses = ImageVector.Builder(
            name = "houses",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.207f, 1f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                lineTo(0.146f, 6.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0.708f)
                lineTo(1f, 7.207f)
                verticalLineTo(12.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2.5f, 14f)
                horizontalLineToRelative(0.55f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -0.05f, -0.5f)
                verticalLineTo(9.415f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -0.56f, -2.475f)
                lineToRelative(5.353f, -5.354f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.793f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
                lineTo(12f, 3.793f)
                verticalLineTo(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3.293f)
                lineToRelative(1.854f, 1.853f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.708f)
                lineTo(15f, 8.207f)
                verticalLineTo(13.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-8f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4f, 13.5f)
                verticalLineTo(8.207f)
                lineToRelative(-0.146f, 0.147f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, -0.708f)
                close()
            }
        }.build()
        
        return _Houses!!
    }

private var _Houses: ImageVector? = null

