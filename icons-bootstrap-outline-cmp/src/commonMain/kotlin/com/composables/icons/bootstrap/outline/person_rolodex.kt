package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PersonRolodex: ImageVector
    get() {
        if (_PersonRolodex != null) return _PersonRolodex!!
        
        _PersonRolodex = ImageVector.Builder(
            name = "person-rolodex",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 9.05f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 0f, -5f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0f, 5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(11f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(6.707f)
                lineTo(6f, 1.293f)
                arcTo(1f, 1f, 0f, false, false, 5.293f, 1f)
                close()
                moveToRelative(0f, 1f)
                horizontalLineToRelative(4.293f)
                lineTo(6f, 2.707f)
                arcTo(1f, 1f, 0f, false, false, 6.707f, 3f)
                horizontalLineTo(15f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-0.085f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -2.4f, -0.63f)
                curveTo(11.885f, 11.223f, 10.554f, 10f, 8f, 10f)
                curveToRelative(-2.555f, 0f, -3.886f, 1.224f, -4.514f, 2.37f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -2.4f, 0.63f)
                horizontalLineTo(1f)
                close()
            }
        }.build()
        
        return _PersonRolodex!!
    }

private var _PersonRolodex: ImageVector? = null

