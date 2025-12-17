package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Floppy: ImageVector
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
                moveTo(0f, 1.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 1.5f, 0f)
                horizontalLineTo(3f)
                verticalLineToRelative(5.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4.5f, 7f)
                horizontalLineToRelative(7f)
                arcTo(1.5f, 1.5f, 0f, false, false, 13f, 5.5f)
                verticalLineTo(0f)
                horizontalLineToRelative(0.086f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.06f, 0.44f)
                lineToRelative(1.415f, 1.414f)
                arcTo(1.5f, 1.5f, 0f, false, true, 16f, 2.914f)
                verticalLineTo(14.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineTo(14f)
                verticalLineToRelative(-5.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 12.5f, 9f)
                horizontalLineToRelative(-9f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2f, 10.5f)
                verticalLineTo(16f)
                horizontalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 0f, 14.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 16f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-9f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                close()
                moveToRelative(9f, -16f)
                horizontalLineTo(4f)
                verticalLineToRelative(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                close()
                moveTo(9f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineTo(9f)
                close()
            }
        }.build()
        
        return _Floppy!!
    }

private var _Floppy: ImageVector? = null

