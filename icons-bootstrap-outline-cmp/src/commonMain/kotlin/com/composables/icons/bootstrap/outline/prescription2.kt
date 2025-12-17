package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Prescription2: ImageVector
    get() {
        if (_Prescription2 != null) return _Prescription2!!
        
        _Prescription2 = ImageVector.Builder(
            name = "prescription2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(9f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                verticalLineToRelative(-2f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineToRelative(2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                verticalLineToRelative(10.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-7f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3f, 14.5f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
                moveToRelative(2f, 3f)
                verticalLineToRelative(10.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineTo(4f)
                close()
                moveTo(3f, 3f)
                horizontalLineToRelative(10f)
                verticalLineTo(1f)
                horizontalLineTo(3f)
                close()
            }
        }.build()
        
        return _Prescription2!!
    }

private var _Prescription2: ImageVector? = null

