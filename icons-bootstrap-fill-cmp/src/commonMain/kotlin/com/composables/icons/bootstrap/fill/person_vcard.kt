package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.PersonVcard: ImageVector
    get() {
        if (_PersonVcard != null) return _PersonVcard!!
        
        _PersonVcard = ImageVector.Builder(
            name = "person-vcard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(9f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineToRelative(-4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                moveTo(9f, 8f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineToRelative(-4f)
                arcTo(0.5f, 0.5f, 0f, false, false, 9f, 8f)
                moveToRelative(1f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                moveToRelative(-1f, 2f)
                curveTo(9f, 10.567f, 7.21f, 9f, 5f, 9f)
                curveToRelative(-2.086f, 0f, -3.8f, 1.398f, -3.984f, 3.181f)
                arcTo(1f, 1f, 0f, false, false, 2f, 13f)
                horizontalLineToRelative(6.96f)
                quadToRelative(0.04f, -0.245f, 0.04f, -0.5f)
                moveTo(7f, 6f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, 4f, 0f)
            }
        }.build()
        
        return _PersonVcard!!
    }

private var _PersonVcard: ImageVector? = null

