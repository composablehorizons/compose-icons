package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Prescription: ImageVector
    get() {
        if (_Prescription != null) return _Prescription!!
        
        _Prescription = ImageVector.Builder(
            name = "prescription",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineTo(9f)
                horizontalLineToRelative(0.293f)
                lineToRelative(2f, 2f)
                lineToRelative(-1.147f, 1.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0.708f)
                lineTo(9f, 11.707f)
                lineToRelative(1.146f, 1.147f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, -0.708f)
                lineTo(9.707f, 11f)
                lineToRelative(1.147f, -1.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, -0.708f)
                lineTo(9f, 10.293f)
                lineTo(7.695f, 8.987f)
                arcTo(1.5f, 1.5f, 0f, false, false, 7.5f, 6f)
                close()
                moveTo(6f, 7f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(6f)
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
        
        return _Prescription!!
    }

private var _Prescription: ImageVector? = null

