package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PlusSlashMinus: ImageVector
    get() {
        if (_PlusSlashMinus != null) return _PlusSlashMinus!!
        
        _PlusSlashMinus = ImageVector.Builder(
            name = "plus-slash-minus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.854f, 14.854f)
                lineToRelative(13f, -13f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, -0.708f)
                lineToRelative(-13f, 13f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0.708f)
                moveTo(4f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4f, 1f)
                moveToRelative(5f, 11f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9f, 12f)
            }
        }.build()
        
        return _PlusSlashMinus!!
    }

private var _PlusSlashMinus: ImageVector? = null

