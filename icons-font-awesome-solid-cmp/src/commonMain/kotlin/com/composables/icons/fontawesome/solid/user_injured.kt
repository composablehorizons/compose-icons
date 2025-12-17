package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.UserInjured: ImageVector
    get() {
        if (_UserInjured != null) return _UserInjured!!
        
        _UserInjured = ImageVector.Builder(
            name = "user-injured",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(277.37f, 11.98f)
                curveTo(261.08f, 4.47f, 243.11f, 0f, 224f, 0f)
                curveToRelative(-53.69f, 0f, -99.5f, 33.13f, -118.51f, 80f)
                horizontalLineToRelative(81.19f)
                lineToRelative(90.69f, -68.02f)
                close()
                moveTo(342.51f, 80f)
                curveToRelative(-7.9f, -19.47f, -20.67f, -36.2f, -36.49f, -49.52f)
                lineTo(239.99f, 80f)
                horizontalLineToRelative(102.52f)
                close()
                moveTo(224f, 256f)
                curveToRelative(70.69f, 0f, 128f, -57.31f, 128f, -128f)
                curveToRelative(0f, -5.48f, -0.95f, -10.7f, -1.61f, -16f)
                horizontalLineTo(97.61f)
                curveToRelative(-0.67f, 5.3f, -1.61f, 10.52f, -1.61f, 16f)
                curveToRelative(0f, 70.69f, 57.31f, 128f, 128f, 128f)
                close()
                moveTo(80f, 299.7f)
                verticalLineTo(512f)
                horizontalLineToRelative(128.26f)
                lineToRelative(-98.45f, -221.52f)
                arcTo(132.835f, 132.835f, 0f, false, false, 80f, 299.7f)
                close()
                moveTo(0f, 464f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                verticalLineTo(320.24f)
                curveTo(18.88f, 344.89f, 0f, 381.26f, 0f, 422.4f)
                verticalLineTo(464f)
                close()
                moveToRelative(256f, -48f)
                horizontalLineToRelative(-55.38f)
                lineToRelative(42.67f, 96f)
                horizontalLineTo(256f)
                curveToRelative(26.47f, 0f, 48f, -21.53f, 48f, -48f)
                reflectiveCurveToRelative(-21.53f, -48f, -48f, -48f)
                close()
                moveToRelative(57.6f, -128f)
                horizontalLineToRelative(-16.71f)
                curveToRelative(-22.24f, 10.18f, -46.88f, 16f, -72.89f, 16f)
                reflectiveCurveToRelative(-50.65f, -5.82f, -72.89f, -16f)
                horizontalLineToRelative(-7.37f)
                lineToRelative(42.67f, 96f)
                horizontalLineTo(256f)
                curveToRelative(44.11f, 0f, 80f, 35.89f, 80f, 80f)
                curveToRelative(0f, 18.08f, -6.26f, 34.59f, -16.41f, 48f)
                horizontalLineTo(400f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                verticalLineToRelative(-41.6f)
                curveToRelative(0f, -74.23f, -60.17f, -134.4f, -134.4f, -134.4f)
                close()
            }
        }.build()
        
        return _UserInjured!!
    }

private var _UserInjured: ImageVector? = null

