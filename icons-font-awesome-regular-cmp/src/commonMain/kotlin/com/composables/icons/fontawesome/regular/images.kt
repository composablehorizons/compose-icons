package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Images: ImageVector
    get() {
        if (_Images != null) return _Images!!
        
        _Images = ImageVector.Builder(
            name = "images",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 416f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 26.51f, -21.49f, 48f, -48f, 48f)
                horizontalLineTo(48f)
                curveToRelative(-26.51f, 0f, -48f, -21.49f, -48f, -48f)
                verticalLineTo(176f)
                curveToRelative(0f, -26.51f, 21.49f, -48f, 48f, -48f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(48f)
                horizontalLineTo(54f)
                arcToRelative(6f, 6f, 0f, false, false, -6f, 6f)
                verticalLineToRelative(244f)
                arcToRelative(6f, 6f, 0f, false, false, 6f, 6f)
                horizontalLineToRelative(372f)
                arcToRelative(6f, 6f, 0f, false, false, 6f, -6f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(48f)
                close()
                moveToRelative(42f, -336f)
                horizontalLineTo(150f)
                arcToRelative(6f, 6f, 0f, false, false, -6f, 6f)
                verticalLineToRelative(244f)
                arcToRelative(6f, 6f, 0f, false, false, 6f, 6f)
                horizontalLineToRelative(372f)
                arcToRelative(6f, 6f, 0f, false, false, 6f, -6f)
                verticalLineTo(86f)
                arcToRelative(6f, 6f, 0f, false, false, -6f, -6f)
                close()
                moveToRelative(6f, -48f)
                curveToRelative(26.51f, 0f, 48f, 21.49f, 48f, 48f)
                verticalLineToRelative(256f)
                curveToRelative(0f, 26.51f, -21.49f, 48f, -48f, 48f)
                horizontalLineTo(144f)
                curveToRelative(-26.51f, 0f, -48f, -21.49f, -48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.51f, 21.49f, -48f, 48f, -48f)
                horizontalLineToRelative(384f)
                close()
                moveTo(264f, 144f)
                curveToRelative(0f, 22.091f, -17.909f, 40f, -40f, 40f)
                reflectiveCurveToRelative(-40f, -17.909f, -40f, -40f)
                reflectiveCurveToRelative(17.909f, -40f, 40f, -40f)
                reflectiveCurveToRelative(40f, 17.909f, 40f, 40f)
                close()
                moveToRelative(-72f, 96f)
                lineToRelative(39.515f, -39.515f)
                curveToRelative(4.686f, -4.686f, 12.284f, -4.686f, 16.971f, 0f)
                lineTo(288f, 240f)
                lineToRelative(103.515f, -103.515f)
                curveToRelative(4.686f, -4.686f, 12.284f, -4.686f, 16.971f, 0f)
                lineTo(480f, 208f)
                verticalLineToRelative(80f)
                horizontalLineTo(192f)
                verticalLineToRelative(-48f)
                close()
            }
        }.build()
        
        return _Images!!
    }

private var _Images: ImageVector? = null

