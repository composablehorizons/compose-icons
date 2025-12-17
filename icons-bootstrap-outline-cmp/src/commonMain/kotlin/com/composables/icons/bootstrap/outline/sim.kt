package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Sim: ImageVector
    get() {
        if (_Sim != null) return _Sim!!
        
        _Sim = ImageVector.Builder(
            name = "sim",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 1.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3.5f, 0f)
                horizontalLineToRelative(7.086f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.06f, 0.44f)
                lineToRelative(1.915f, 1.914f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14f, 3.414f)
                verticalLineTo(14.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-9f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2f, 14.5f)
                close()
                moveTo(3.5f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(13f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineTo(3.414f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.146f, -0.353f)
                lineToRelative(-1.915f, -1.915f)
                arcTo(0.5f, 0.5f, 0f, false, false, 10.586f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineTo(6f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(4f)
                close()
                moveToRelative(3f, 0f)
                verticalLineToRelative(2f)
                horizontalLineTo(11f)
                verticalLineTo(4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(11f, 7f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                close()
                moveToRelative(0f, 3f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                close()
                moveToRelative(-3.5f, 2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(5f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                close()
                moveTo(4f, 4.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5.5f, 3f)
                horizontalLineToRelative(5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 12f, 4.5f)
                verticalLineToRelative(7f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4f, 11.5f)
                close()
            }
        }.build()
        
        return _Sim!!
    }

private var _Sim: ImageVector? = null

