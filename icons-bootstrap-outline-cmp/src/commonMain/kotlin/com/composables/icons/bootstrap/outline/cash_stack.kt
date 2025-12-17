package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CashStack: ImageVector
    get() {
        if (_CashStack != null) return _CashStack!!
        
        _CashStack = ImageVector.Builder(
            name = "cash-stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                close()
                moveToRelative(7f, 8f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
                moveToRelative(3f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
            }
        }.build()
        
        return _CashStack!!
    }

private var _CashStack: ImageVector? = null

