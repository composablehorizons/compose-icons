package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Torah: ImageVector
    get() {
        if (_Torah != null) return _Torah!!
        
        _Torah = ImageVector.Builder(
            name = "torah",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320.05f, 366.48f)
                lineToRelative(17.72f, -29.64f)
                horizontalLineToRelative(-35.46f)
                close()
                moveToRelative(99.21f, -166f)
                horizontalLineTo(382.4f)
                lineToRelative(18.46f, 30.82f)
                close()
                moveTo(48f, 0f)
                curveTo(21.49f, 0f, 0f, 14.33f, 0f, 32f)
                verticalLineToRelative(448f)
                curveToRelative(0f, 17.67f, 21.49f, 32f, 48f, 32f)
                reflectiveCurveToRelative(48f, -14.33f, 48f, -32f)
                verticalLineTo(32f)
                curveTo(96f, 14.33f, 74.51f, 0f, 48f, 0f)
                close()
                moveToRelative(172.74f, 311.5f)
                horizontalLineToRelative(36.85f)
                lineToRelative(-18.46f, -30.82f)
                close()
                moveToRelative(161.71f, 0f)
                horizontalLineToRelative(36.86f)
                lineToRelative(-18.45f, -30.8f)
                close()
                moveTo(128f, 464f)
                horizontalLineToRelative(384f)
                verticalLineTo(48f)
                horizontalLineTo(128f)
                close()
                moveToRelative(66.77f, -278.13f)
                arcToRelative(21.22f, 21.22f, 0f, false, true, 18.48f, -10.71f)
                horizontalLineToRelative(59.45f)
                lineToRelative(29.13f, -48.71f)
                arcToRelative(21.13f, 21.13f, 0f, false, true, 18.22f, -10.37f)
                arcTo(20.76f, 20.76f, 0f, false, true, 338f, 126.29f)
                lineToRelative(29.25f, 48.86f)
                horizontalLineToRelative(59.52f)
                arcToRelative(21.12f, 21.12f, 0f, false, true, 18.1f, 32f)
                lineTo(415.63f, 256f)
                lineTo(445f, 305f)
                arcToRelative(20.69f, 20.69f, 0f, false, true, 0.24f, 21.12f)
                arcToRelative(21.25f, 21.25f, 0f, false, true, -18.48f, 10.72f)
                horizontalLineToRelative(-59.47f)
                lineToRelative(-29.13f, 48.7f)
                arcToRelative(21.13f, 21.13f, 0f, false, true, -18.16f, 10.4f)
                arcToRelative(20.79f, 20.79f, 0f, false, true, -18f, -10.22f)
                lineToRelative(-29.25f, -48.88f)
                horizontalLineToRelative(-59.5f)
                arcToRelative(21.11f, 21.11f, 0f, false, true, -18.1f, -32f)
                lineTo(224.36f, 256f)
                lineTo(195f, 207f)
                arcToRelative(20.7f, 20.7f, 0f, false, true, -0.23f, -21.13f)
                close()
                moveTo(592f, 0f)
                curveToRelative(-26.51f, 0f, -48f, 14.33f, -48f, 32f)
                verticalLineToRelative(448f)
                curveToRelative(0f, 17.67f, 21.49f, 32f, 48f, 32f)
                reflectiveCurveToRelative(48f, -14.33f, 48f, -32f)
                verticalLineTo(32f)
                curveToRelative(0f, -17.67f, -21.49f, -32f, -48f, -32f)
                close()
                moveTo(320f, 145.53f)
                lineToRelative(-17.78f, 29.62f)
                horizontalLineToRelative(35.46f)
                close()
                moveToRelative(-62.45f, 55f)
                horizontalLineToRelative(-36.81f)
                lineToRelative(18.44f, 30.8f)
                close()
                moveToRelative(29.58f, 111f)
                horizontalLineToRelative(65.79f)
                lineTo(386.09f, 256f)
                lineToRelative(-33.23f, -55.52f)
                horizontalLineToRelative(-65.79f)
                lineTo(253.9f, 256f)
                close()
            }
        }.build()
        
        return _Torah!!
    }

private var _Torah: ImageVector? = null

