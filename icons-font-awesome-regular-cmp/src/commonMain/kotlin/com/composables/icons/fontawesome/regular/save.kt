package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Save: ImageVector
    get() {
        if (_Save != null) return _Save!!
        
        _Save = ImageVector.Builder(
            name = "save",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(433.941f, 129.941f)
                lineToRelative(-83.882f, -83.882f)
                arcTo(48f, 48f, 0f, false, false, 316.118f, 32f)
                horizontalLineTo(48f)
                curveTo(21.49f, 32f, 0f, 53.49f, 0f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                verticalLineTo(163.882f)
                arcToRelative(48f, 48f, 0f, false, false, -14.059f, -33.941f)
                close()
                moveTo(272f, 80f)
                verticalLineToRelative(80f)
                horizontalLineTo(144f)
                verticalLineTo(80f)
                horizontalLineToRelative(128f)
                close()
                moveToRelative(122f, 352f)
                horizontalLineTo(54f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, -6f)
                verticalLineTo(86f)
                arcToRelative(6f, 6f, 0f, false, true, 6f, -6f)
                horizontalLineToRelative(42f)
                verticalLineToRelative(104f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(176f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineTo(83.882f)
                lineToRelative(78.243f, 78.243f)
                arcToRelative(6f, 6f, 0f, false, true, 1.757f, 4.243f)
                verticalLineTo(426f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, 6f)
                close()
                moveTo(224f, 232f)
                curveToRelative(-48.523f, 0f, -88f, 39.477f, -88f, 88f)
                reflectiveCurveToRelative(39.477f, 88f, 88f, 88f)
                reflectiveCurveToRelative(88f, -39.477f, 88f, -88f)
                reflectiveCurveToRelative(-39.477f, -88f, -88f, -88f)
                close()
                moveToRelative(0f, 128f)
                curveToRelative(-22.056f, 0f, -40f, -17.944f, -40f, -40f)
                reflectiveCurveToRelative(17.944f, -40f, 40f, -40f)
                reflectiveCurveToRelative(40f, 17.944f, 40f, 40f)
                reflectiveCurveToRelative(-17.944f, 40f, -40f, 40f)
                close()
            }
        }.build()
        
        return _Save!!
    }

private var _Save: ImageVector? = null

