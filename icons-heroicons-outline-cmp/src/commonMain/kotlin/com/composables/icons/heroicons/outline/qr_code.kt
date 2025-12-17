package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.QrCode: ImageVector
    get() {
        if (_QrCode != null) return _QrCode!!
        
        _QrCode = ImageVector.Builder(
            name = "qr-code",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(3.75f, 4.875f)
                curveToRelative(0f, -0.621f, 0.504f, -1.125f, 1.125f, -1.125f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.621f, -0.504f, 1.125f, -1.125f, 1.125f)
                horizontalLineToRelative(-4.5f)
                arcTo(1.125f, 1.125f, 0f, false, true, 3.75f, 9.375f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(3.75f, 14.625f)
                curveToRelative(0f, -0.621f, 0.504f, -1.125f, 1.125f, -1.125f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.621f, -0.504f, 1.125f, -1.125f, 1.125f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, -1.125f, -1.125f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(13.5f, 4.875f)
                curveToRelative(0f, -0.621f, 0.504f, -1.125f, 1.125f, -1.125f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.621f, -0.504f, 1.125f, -1.125f, 1.125f)
                horizontalLineToRelative(-4.5f)
                arcTo(1.125f, 1.125f, 0f, false, true, 13.5f, 9.375f)
                verticalLineToRelative(-4.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(6.75f, 6.75f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(-0.75f)
                close()
                moveTo(6.75f, 16.5f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(-0.75f)
                close()
                moveTo(16.5f, 6.75f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(-0.75f)
                close()
                moveTo(13.5f, 13.5f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(-0.75f)
                close()
                moveTo(13.5f, 19.5f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(-0.75f)
                close()
                moveTo(19.5f, 13.5f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(-0.75f)
                close()
                moveTo(19.5f, 19.5f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(-0.75f)
                close()
                moveTo(16.5f, 16.5f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(-0.75f)
                close()
            }
        }.build()
        
        return _QrCode!!
    }

private var _QrCode: ImageVector? = null

