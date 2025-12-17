package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Floppy: ImageVector
    get() {
        if (_Floppy != null) return _Floppy!!
        
        _Floppy = ImageVector.Builder(
            name = "floppy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 2f)
                horizontalLineTo(9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 0f)
                horizontalLineToRelative(11.586f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.06f, 0.44f)
                lineToRelative(1.415f, 1.414f)
                arcTo(1.5f, 1.5f, 0f, false, true, 16f, 2.914f)
                verticalLineTo(14.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-13f)
                arcTo(1.5f, 1.5f, 0f, false, true, 0f, 14.5f)
                verticalLineToRelative(-13f)
                arcTo(1.5f, 1.5f, 0f, false, true, 1.5f, 0f)
                moveTo(1f, 1.5f)
                verticalLineToRelative(13f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineTo(2f)
                verticalLineToRelative(-4.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3.5f, 9f)
                horizontalLineToRelative(9f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.5f, 1.5f)
                verticalLineTo(15f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineTo(2.914f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.146f, -0.353f)
                lineToRelative(-1.415f, -1.415f)
                arcTo(0.5f, 0.5f, 0f, false, false, 13.086f, 1f)
                horizontalLineTo(13f)
                verticalLineToRelative(4.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 11.5f, 7f)
                horizontalLineToRelative(-7f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3f, 5.5f)
                verticalLineTo(1f)
                horizontalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                moveToRelative(3f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineTo(1f)
                horizontalLineTo(4f)
                close()
                moveTo(3f, 15f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-9f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                close()
            }
        }.build()
        
        return _Floppy!!
    }

private var _Floppy: ImageVector? = null

