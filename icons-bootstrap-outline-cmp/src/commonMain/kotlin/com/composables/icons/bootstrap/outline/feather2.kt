package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Feather2: ImageVector
    get() {
        if (_Feather2 != null) return _Feather2!!
        
        _Feather2 = ImageVector.Builder(
            name = "feather2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 1.063f)
                verticalLineToRelative(9.556f)
                lineTo(6f, 8.819f)
                verticalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, true, 1.5f, -1.937f)
                moveTo(8f, 0f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                verticalLineToRelative(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.116f, 0.32f)
                lineTo(7.5f, 12.181f)
                verticalLineTo(15.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineToRelative(-3.319f)
                lineToRelative(2.384f, -2.86f)
                arcTo(0.5f, 0.5f, 0f, false, false, 11f, 9f)
                verticalLineTo(3f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                moveToRelative(0.5f, 1.063f)
                arcTo(2f, 2f, 0f, false, true, 10f, 3f)
                verticalLineToRelative(0.293f)
                lineToRelative(-1.5f, 1.5f)
                close()
                moveTo(10f, 4.707f)
                verticalLineTo(8.82f)
                lineToRelative(-1.5f, 1.8f)
                verticalLineTo(6.207f)
                close()
            }
        }.build()
        
        return _Feather2!!
    }

private var _Feather2: ImageVector? = null

