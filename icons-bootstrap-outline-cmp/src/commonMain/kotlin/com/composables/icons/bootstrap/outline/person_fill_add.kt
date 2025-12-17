package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PersonFillAdd: ImageVector
    get() {
        if (_PersonFillAdd != null) return _PersonFillAdd!!
        
        _PersonFillAdd = ImageVector.Builder(
            name = "person-fill-add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 16f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, 0f, -7f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 0f, 7f)
                moveToRelative(0.5f, -5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                moveToRelative(-2f, -6f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 13f)
                curveToRelative(0f, 1f, 1f, 1f, 1f, 1f)
                horizontalLineToRelative(5.256f)
                arcTo(4.5f, 4.5f, 0f, false, true, 8f, 12.5f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 1.544f, -3.393f)
                quadTo(8.844f, 9.002f, 8f, 9f)
                curveToRelative(-5f, 0f, -6f, 3f, -6f, 4f)
            }
        }.build()
        
        return _PersonFillAdd!!
    }

private var _PersonFillAdd: ImageVector? = null

