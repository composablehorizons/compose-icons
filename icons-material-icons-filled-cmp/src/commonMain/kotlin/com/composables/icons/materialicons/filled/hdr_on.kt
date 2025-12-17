package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Hdr_on: ImageVector
    get() {
        if (_Hdr_on != null) return _Hdr_on!!
        
        _Hdr_on = ImageVector.Builder(
            name = "hdr_on",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 11.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(16f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.1f)
                lineToRelative(0.9f, 2f)
                horizontalLineTo(21f)
                lineToRelative(-0.9f, -2.1f)
                curveToRelative(0.5f, -0.3f, 0.9f, -0.8f, 0.9f, -1.4f)
                close()
                moveToRelative(-1.5f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                close()
                moveToRelative(-13f, -0.5f)
                horizontalLineToRelative(-2f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineTo(6.5f)
                verticalLineToRelative(2f)
                close()
                moveTo(13f, 9f)
                horizontalLineTo(9.5f)
                verticalLineToRelative(6f)
                horizontalLineTo(13f)
                curveToRelative(0.8f, 0f, 1.5f, -0.7f, 1.5f, -1.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f)
                close()
                moveToRelative(0f, 4.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                close()
            }
        }.build()
        
        return _Hdr_on!!
    }

private var _Hdr_on: ImageVector? = null

