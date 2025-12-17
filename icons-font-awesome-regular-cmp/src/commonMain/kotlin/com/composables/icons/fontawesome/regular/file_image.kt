package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.FileImage: ImageVector
    get() {
        if (_FileImage != null) return _FileImage!!
        
        _FileImage = ImageVector.Builder(
            name = "file-image",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(369.9f, 97.9f)
                lineTo(286f, 14f)
                curveTo(277f, 5f, 264.8f, -0.1f, 252.1f, -0.1f)
                horizontalLineTo(48f)
                curveTo(21.5f, 0f, 0f, 21.5f, 0f, 48f)
                verticalLineToRelative(416f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(288f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(131.9f)
                curveToRelative(0f, -12.7f, -5.1f, -25f, -14.1f, -34f)
                close()
                moveTo(332.1f, 128f)
                horizontalLineTo(256f)
                verticalLineTo(51.9f)
                lineToRelative(76.1f, 76.1f)
                close()
                moveTo(48f, 464f)
                verticalLineTo(48f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(104f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(104f)
                verticalLineToRelative(288f)
                horizontalLineTo(48f)
                close()
                moveToRelative(32f, -48f)
                horizontalLineToRelative(224f)
                verticalLineTo(288f)
                lineToRelative(-23.5f, -23.5f)
                curveToRelative(-4.7f, -4.7f, -12.3f, -4.7f, -17f, 0f)
                lineTo(176f, 352f)
                lineToRelative(-39.5f, -39.5f)
                curveToRelative(-4.7f, -4.7f, -12.3f, -4.7f, -17f, 0f)
                lineTo(80f, 352f)
                verticalLineToRelative(64f)
                close()
                moveToRelative(48f, -240f)
                curveToRelative(-26.5f, 0f, -48f, 21.5f, -48f, 48f)
                reflectiveCurveToRelative(21.5f, 48f, 48f, 48f)
                reflectiveCurveToRelative(48f, -21.5f, 48f, -48f)
                reflectiveCurveToRelative(-21.5f, -48f, -48f, -48f)
                close()
            }
        }.build()
        
        return _FileImage!!
    }

private var _FileImage: ImageVector? = null

