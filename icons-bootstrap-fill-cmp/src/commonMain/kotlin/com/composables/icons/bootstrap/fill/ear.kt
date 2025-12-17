package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Ear: ImageVector
    get() {
        if (_Ear != null) return _Ear!!
        
        _Ear = ImageVector.Builder(
            name = "ear",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 0f)
                arcTo(5.5f, 5.5f, 0f, false, false, 3f, 5.5f)
                verticalLineToRelative(7.047f)
                arcToRelative(3.453f, 3.453f, 0f, false, false, 6.687f, 1.212f)
                lineToRelative(0.51f, -1.363f)
                arcToRelative(4.6f, 4.6f, 0f, false, true, 0.67f, -1.197f)
                lineToRelative(2.008f, -2.581f)
                arcTo(5.34f, 5.34f, 0f, false, false, 8.66f, 0f)
                close()
                moveTo(7f, 5.5f)
                verticalLineToRelative(2.695f)
                quadToRelative(0.168f, -0.09f, 0.332f, -0.192f)
                curveToRelative(0.327f, -0.208f, 0.577f, -0.44f, 0.72f, -0.727f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.895f, 0.448f)
                curveToRelative(-0.256f, 0.513f, -0.673f, 0.865f, -1.079f, 1.123f)
                arcTo(9f, 9f, 0f, false, true, 7f, 9.313f)
                verticalLineTo(11.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-6f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 5f, 0f)
                verticalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, -3f, 0f)
            }
        }.build()
        
        return _Ear!!
    }

private var _Ear: ImageVector? = null

