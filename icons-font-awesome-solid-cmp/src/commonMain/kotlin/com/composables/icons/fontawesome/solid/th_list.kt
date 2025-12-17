package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ThList: ImageVector
    get() {
        if (_ThList != null) return _ThList!!
        
        _ThList = ImageVector.Builder(
            name = "th-list",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(149.333f, 216f)
                verticalLineToRelative(80f)
                curveToRelative(0f, 13.255f, -10.745f, 24f, -24f, 24f)
                horizontalLineTo(24f)
                curveToRelative(-13.255f, 0f, -24f, -10.745f, -24f, -24f)
                verticalLineToRelative(-80f)
                curveToRelative(0f, -13.255f, 10.745f, -24f, 24f, -24f)
                horizontalLineToRelative(101.333f)
                curveToRelative(13.255f, 0f, 24f, 10.745f, 24f, 24f)
                close()
                moveTo(0f, 376f)
                verticalLineToRelative(80f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(101.333f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineToRelative(-80f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                horizontalLineTo(24f)
                curveToRelative(-13.255f, 0f, -24f, 10.745f, -24f, 24f)
                close()
                moveTo(125.333f, 32f)
                horizontalLineTo(24f)
                curveTo(10.745f, 32f, 0f, 42.745f, 0f, 56f)
                verticalLineToRelative(80f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(101.333f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineTo(56f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                close()
                moveToRelative(80f, 448f)
                horizontalLineTo(488f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineToRelative(-80f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                horizontalLineTo(205.333f)
                curveToRelative(-13.255f, 0f, -24f, 10.745f, -24f, 24f)
                verticalLineToRelative(80f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                close()
                moveToRelative(-24f, -424f)
                verticalLineToRelative(80f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineTo(488f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineTo(56f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                horizontalLineTo(205.333f)
                curveToRelative(-13.255f, 0f, -24f, 10.745f, -24f, 24f)
                close()
                moveToRelative(24f, 264f)
                horizontalLineTo(488f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineToRelative(-80f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                horizontalLineTo(205.333f)
                curveToRelative(-13.255f, 0f, -24f, 10.745f, -24f, 24f)
                verticalLineToRelative(80f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                close()
            }
        }.build()
        
        return _ThList!!
    }

private var _ThList: ImageVector? = null

